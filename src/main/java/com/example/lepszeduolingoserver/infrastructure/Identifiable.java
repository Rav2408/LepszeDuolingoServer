package com.example.lepszeduolingoserver.infrastructure;

public interface Identifiable<ID> {

    ID getId();

    void setId(ID id);
}
