//package com.example.postgres.springpostgresdocker.mapper;
//
//import com.example.postgres.springpostgresdocker.Insure.InsureEntity;
//import com.example.postgres.springpostgresdocker.Insure.InsureResponse;
//import com.example.postgres.springpostgresdocker.bullet.BulletEntity;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.Named;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Mapper(componentModel = "spring")
//public interface InsureMapper {
//
//    @Mapping(target = "bullets",source = "bulletEntities",qualifiedByName = "mapBullets")
//    InsureResponse fromEntity(InsureEntity entity);
//
//    List<InsureResponse> fromEntities(List<InsureEntity> entities);
//
//    @Named("mapBullets")
//    default List<String> mapBullets(List<BulletEntity> bulletEntities){
//        return bulletEntities.stream().map(bullet -> bullet.getName()).collect(Collectors.toList());
//    }
//
//    List<InsureResponse> toInsureResponse(List<InsureEntity> entities);
//}
