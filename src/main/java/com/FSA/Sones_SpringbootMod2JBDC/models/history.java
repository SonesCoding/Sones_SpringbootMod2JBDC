package com.FSA.Sones_SpringbootMod2JBDC.models;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class history {

    private @Getter @Setter Long id;
    private @Getter @Setter Date checkin;
    private @Getter @Setter Date checkout;
        private @Getter @Setter String borrowedBook;



public history(Long id, Date checkin, Date checkout, String borrowedBook) {
    super();

    this.id = id;
      this.checkin = checkin;
      this.checkout = checkout;
      this.borrowedBook = borrowedBook;

    }

}

