package com.example.database.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.Mapping;

import java.io.Serializable;
import java.util.Date;
@MappedSuperclass
@Setter
@Getter
@ToString
public class BaseEntity implements Serializable {
    public Date createdDate;

}
