package AugustBatchProblem.Advanced.javaDP;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {

    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    //public ArrayList<Datum> data;

    public Product() {
    }

    public Product(int page, int per_page, int total, int total_pages) {
        setPage(page);
        setPer_page(per_page);
        setTotal(total);
        setTotal_pages(total_pages);

    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    /*public ArrayList<Datum> getData() {
        return data;
    }

    public void setData(ArrayList<Datum> data) {
        this.data = data;
    }*/




}

