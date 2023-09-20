package com.FSA.Sones_SpringbootMod2JBDC.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class author {

    private @Getter @Setter Long id;
    private @Getter @Setter String fname;
    private @Getter @Setter String lname;


public author(Long id, String fname, String lname) {
    super();

    this.id = id;
      this.fname = fname;
      this.lname = lname;
    }

}

