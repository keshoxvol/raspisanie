// package ru.codovstvo.raspisanie.models;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Getter
// @Setter
// @NoArgsConstructor
// @Entity
// public class PartyThingHours {
//     @Id
// 	@GeneratedValue(strategy=GenerationType.AUTO)
//     private Long id;
    
//     private Long partyId;
//     private int numberHoursBalance;
//     private Long thingId;
//     private Long teacherId;

//     public PartyThingHours(Long partyId, Long thingId, Long teacherId, int numberHoursBalance){
//         this.partyId = partyId;
//         this.thingId = thingId;
//         this.teacherId= teacherId;
//         this.numberHoursBalance = numberHoursBalance;
//     }
    
// }