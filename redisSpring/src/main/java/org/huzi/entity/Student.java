package org.huzi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private String Sno;
    private String Sname;
    private String Ssex;
    private String datasource;
}
