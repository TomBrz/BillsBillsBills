package Entitites;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)

public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

	public Date convertToDatabaseColumn(LocalDate localDate) {
		// TODO Auto-generated method stub
		return localDate == null? null : Date.valueOf(localDate);
	}

	public LocalDate convertToEntityAttribute(Date date) {
		// TODO Auto-generated method stub
		return date == null? null : date.toLocalDate();
	}

}
