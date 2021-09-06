package com.example.modules.sys.mapper;


import com.example.modules.common.entity.FromMap;
import com.example.modules.sys.vo.TestVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TestUserMapper {

    TestUserMapper INSTANCE = Mappers.getMapper(TestUserMapper.class);

    // success 3
    @Mapping(expression = "java(map.getDate(\"create_time\"))",target = "testCreateTime")
    @Mapping(expression = "java(map.getStr(\"name\"))",target = "testName")
    @Mapping(expression = "java(map.getLong(\"user_id\"))",target = "testId")
    TestVo fromMap(FromMap map);

    // success 2
//    default void updateTestVo(@MappingTarget TestVo target, Map<String, Object> params) {
//            if (params.containsKey("name")) {
//                target.setTestName((String) params.get("name"));
//            }
//            if (params.containsKey("user_id")) {
//                target.setTestId((Long) params.get("user_id"));
//            }
//    }


    // success 1
//    @Mapping(target = "testId", source = "map",qualifiedByName = "f1")
//    @Mapping(target = "testName", source = "map",qualifiedByName = "f2")
//    TestVo toTestVo(Source source);
//
//    @Named("f1")
//    default Long f1(Map<String,Object> map) {
//        return (Long) map.get("user_id");
//    }
//
//    @Named("f2")
//    default String f2(Map<String,Object> map) {
//        return (String) map.get("name");
//    }
}
