package com.decorator.looping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jbrooks on 04/11/2015.
 */
public abstract class Loop {
    public abstract List<Object> getFlattenedCollectionFromMultiDimCollection(List<List> collectionOfCollections);
}
