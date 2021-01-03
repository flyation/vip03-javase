package com.southwind.homework3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NewsTitle {
    private Integer id;
    private String name;
    private String createBy;

    public NewsTitle(Integer id, String name, String createBy) {
        this.id = id;
        this.name = name;
        this.createBy = createBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

//    public static void main(String[] args) {
//        ArrayList<NewsTitle> list = new ArrayList<>();
//        list.add(new NewsTitle(1, "汽车", "admin"));
//        list.add(new NewsTitle(2, "高考", "admin"));
//
//        int size = list.size();
//        System.out.println("新闻标题数目为：" + size + "条");
//        for (int i = 0; i < size; i++) {
//            System.out.println((i + 1) + "：" + list.get(i).getName());
//        }
//    }

//    public static void main(String[] args) {
//        LinkedList<NewsTitle> list = new LinkedList<>();
//        list.add(new NewsTitle(1, "汽车", "admin"));
//        list.add(new NewsTitle(2, "医学", "admin"));
//        System.out.println("头条的新闻标题为：" + list.getFirst().getName());
//        System.out.println("排在最后的新闻标题为：" + list.getLast().getName());
//
//        NewsTitle first = list.removeFirst();
//        NewsTitle last = list.removeLast();
//        System.out.println("删除的头条新闻标题为：" + first.getName());
//        System.out.println("删除的末条新闻标题为：" + last.getName());
//        System.out.println("删除后剩余的新闻条数：" + list.size());
//    }

    public static void main(String[] args) {
        Set<NewsTitle> set = new HashSet<>();
        set.add(new NewsTitle(1, "汽车", "admin"));
        set.add(new NewsTitle(2, "高考", "admin"));

        int size = set.size();
        System.out.println("新闻标题数目为：" + size + "条");
        Iterator<NewsTitle> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        System.out.println("********************");

        for (NewsTitle newsTitle : set) {
            System.out.println(newsTitle.getName());
        }
    }
}
