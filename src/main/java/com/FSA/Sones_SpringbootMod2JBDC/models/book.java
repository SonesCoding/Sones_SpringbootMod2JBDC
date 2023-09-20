package com.FSA.Sones_SpringbootMod2JBDC.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class book {
    
    private @Getter @Setter Long id;

    private @Getter @Setter String title;
    private @Getter @Setter String author;


public book(Long id, String title, String author) {
    super();
    this.id = id;
      this.title = title;
      this.author = author;
    }

}
