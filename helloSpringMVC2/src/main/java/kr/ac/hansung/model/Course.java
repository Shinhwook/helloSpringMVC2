package kr.ac.hansung.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Course {
	
	
	@Min(value=2017,message="수강 년도는 2018년 입니다.")
	@Max(value=2018,message="수강 년도는 2018년 입니다.")
	int year;
	
	@Min(value=1,message="1또는 2학기 이어야만 합니다(현재 1학기)")
	@Max(value=2,message="1또는 2학기 이어야만 합니다(현재 1학기)")
	int semester;
	
	@Size(min=7,max=7,message=" < ex. CSE0000 >")
	String subjectCode;
	String subject;
	String classification;
	
	@Min(value=1,message="1 ~ 3 학점 이어야만 합니다")
	@Max(value=3,message="1 ~ 3 학점 이어야만 합니다")
	int grade;

	public Course(int year, int semester, String subjectCode, String subject, String classification, int grade) {
		this.year = year;
		this.semester = semester;
		this.subjectCode = subjectCode;
		this.subject = subject;
		this.classification = classification;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Course [수강년도=" + year + ", 학기=" + semester + ", 과목코드=" + subjectCode + ", 과목명="
				+ subject + ", 이수 구분=" + classification + ", 학점=" + grade + "]";
	}
}

