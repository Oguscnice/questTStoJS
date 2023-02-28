// import { Address } from './address';
// import { Photo } from './photo';

// export class User {
//     birthdate: Date;
//     size: number;
//     photos: Photo[];
//     address: Address; 
// }

import java.util.ArrayList;
import java.util.Date;

class User {
    private Date birthdate;
    private double size;
    private Photo[] photos;
    private Address address; 

      public User(Date birthdate, double size, Photo[] photos, Address address){
    this.birthdate = birthdate;
    this.size = size;
    this.photos = photos;
    this.address = address;
  }
}