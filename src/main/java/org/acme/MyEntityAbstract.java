package org.acme;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class MyEntityAbstract<T extends Number> {

    @Id
    @GeneratedValue
    public T id;

}
