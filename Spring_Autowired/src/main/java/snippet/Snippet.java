package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	    xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="
	        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
	        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"> <!-- bean definitions here -->
	<context:annotation-config/>
	<bean id="Humanheart" class="org.tnsindia.springautowired.Heart">
		<property name="nameOfAnimal" value="Human"/>
		<property name="noOfHeart" value="1"/>
	</bean>
	
	<bean id="Octopusheart" class="org.tnsindia.springautowired.Heart">
		<property name="nameOfAnimal" value="Octopus"/>
		<property name="noOfHeart" value="2"/>
	</bean>
	<bean id="human" class="org.tnsindia.springautowired.Human">
	</bean>
	</beans>
}

