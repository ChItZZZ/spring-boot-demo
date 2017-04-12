package com.shzhong.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by my on 17/4/12.
 */

@Entity
public class Blog {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 20)
    private String title;

    @Column(name = "cont",length = 200)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Blog() {
    }
}
