package com.community.aem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.inject.Inject;


@Model(adaptables = Resource.class)
public class Multifield {
    @Inject
    @Optional
    public Resource products;

}
