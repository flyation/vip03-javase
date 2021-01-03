package com.southwind;

import java.util.List;

public class CategoryVO {
    private Integer id;
    private String title;
    private List<CategoryVO> children;
    private Integer sort;
}
