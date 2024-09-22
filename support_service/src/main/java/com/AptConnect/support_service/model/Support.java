package com.AptConnect.support_service.model;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "help")
public class Support {
    @Id
    private Long id;
    private  String name;
    private  String phoneNo;
    private String email;
    private  String helpSubject;
    private  String helpDescription;

}
