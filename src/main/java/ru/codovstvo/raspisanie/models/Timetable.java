// package ru.codovstvo.raspisanie.models;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// import lombok.Data;
// import lombok.NoArgsConstructor;
// import java.lang.Long;

// @Data
// @NoArgsConstructor
// @Entity
// public class Timetable {
//     @Id
// 	@GeneratedValue(strategy=GenerationType.AUTO)
//     private Long id;

//     private Thing thing;
//     private Party party;
//     private Long audienceId;
//     private Teacher teacher;
//     private String date;

//     public Timetable(Thing thing, Party party, Long audienceId, Teacher teacher, String date) {
//         this.thing = thing;
//         this.party = party;
//         this.audienceId = audienceId;
//         this.teacher = teacher;
//         this.date = date;
//     }
// }