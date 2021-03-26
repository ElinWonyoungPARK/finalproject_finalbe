package org.cart.api.uss.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserVo is a Querydsl query type for UserVo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserVo extends EntityPathBase<UserVo> {

    private static final long serialVersionUID = -1555924483L;

    public static final QUserVo userVo = new QUserVo("userVo");

    public final StringPath admin = createString("admin");

    public final StringPath birthday = createString("birthday");

    public final StringPath email = createString("email");

    public final StringPath gender = createString("gender");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath preferGenre = createString("preferGenre");

    public final StringPath userid = createString("userid");

    public final StringPath username = createString("username");

    public final NumberPath<Long> userNum = createNumber("userNum", Long.class);

    public QUserVo(String variable) {
        super(UserVo.class, forVariable(variable));
    }

    public QUserVo(Path<? extends UserVo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserVo(PathMetadata metadata) {
        super(UserVo.class, metadata);
    }

}

