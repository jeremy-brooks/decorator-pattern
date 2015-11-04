package com.decorator.looping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jbrooks on 04/11/2015.
 */
public class GetFlattenedCollections extends Loop {
    @Override
    public List<Object> getFlattenedCollectionFromMultiDimCollection(List<List> collectionOfCollections) {
        List<Object> collectionFlattened = new ArrayList<Object>();
        for (List<List> collection : collectionOfCollections){
            collectionFlattened.addAll(collection);
        }
        return collectionFlattened;
    }
}
