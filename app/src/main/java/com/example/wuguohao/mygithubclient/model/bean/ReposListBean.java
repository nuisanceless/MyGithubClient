package com.example.wuguohao.mygithubclient.model.bean;

import java.util.List;

/**
 * Created by wuguohao on 17/3/3.
 */

public class ReposListBean
{
    private List<RepoBean> repos;

    public static class RepoBean {
        private String name;
        private String description;
        private String language;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setDescription(String description) {
            this.description = description;
        }
        public String getDescription() {
            return description;
        }

        public void setLanguage (String language) {
            this.language = language;
        }
        public String getLanguage() {
            return language;
        }
    }
}
