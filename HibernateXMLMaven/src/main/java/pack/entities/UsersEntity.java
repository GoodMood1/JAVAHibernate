package pack.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

//@Data
@Getter
@Setter
@ToString
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
//
@Entity
@Table(name = "users", schema = "usersdb", catalog = "")
public class UsersEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private Integer id;
	@Basic
	@Column(name = "surname")
	private String surname;
	@Basic
	@Column(name = "name")
	private String name;
	@Basic
	@Column(name = "birthDate")
	private Date birthDate;
	@Basic
	@Column(name = "activated")
	private boolean activated;
}
