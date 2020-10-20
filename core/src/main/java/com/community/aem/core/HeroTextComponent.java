package com.community.aem.core;

import com.adobe.cq.sightly.WCMUsePojo;

public class HeroTextComponent extends WCMUsePojo {

    private HeroTextBean heroTextBean = null;

    public HeroTextBean getHeroTextBean() {
        return heroTextBean;
    }

    @Override
    public void activate() throws Exception {
        heroTextBean = new HeroTextBean();
        String title;
        String description;
        int number;
        title = getProperties().get("title","");
        description = getProperties().get("description","");
        number = Integer.parseInt(getProperties().get("number",""));
        heroTextBean.setDescription(description);
        heroTextBean.setTitle(title);
        heroTextBean.setNumber(number);

    }
}
