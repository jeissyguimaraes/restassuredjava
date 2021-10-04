package com.apimantisbugtracker.jsonObjects;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Status {

    private  long id;
    private  String name;
    private  String label;


}
