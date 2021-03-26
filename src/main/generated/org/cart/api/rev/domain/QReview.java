package org.cart.api.rev.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReview is a Querydsl query type for Review
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReview extends EntityPathBase<Review> {

    private static final long serialVersionUID = 1660994559L;

    public static final QReview review = new QReview("review");

    public final StringPath regDate = createString("regDate");

    public final StringPath reviewContent = createString("reviewContent");

    public final NumberPath<Integer> reviewNum = createNumber("reviewNum", Integer.class);

    public final StringPath reviewTitle = createString("reviewTitle");

    public final StringPath score = createString("score");

    public QReview(String variable) {
        super(Review.class, forVariable(variable));
    }

    public QReview(Path<? extends Review> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReview(PathMetadata metadata) {
        super(Review.class, metadata);
    }

}

