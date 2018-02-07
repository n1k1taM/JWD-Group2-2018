package by.tc.task01.dao.builder;

import by.tc.task01.entity.Appliance;

public interface ApplianceBuilder {
	
	public Appliance build(String ApplinceType, String line);// именование и code convention - ну неужели так трудно
	// вот что за line? AoolinceType - и с опечаткой и с большой буквы
}
