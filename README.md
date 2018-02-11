# Boni question3

You have following code part below which consist of several “if else” statements. You
need to optimize the code to support different data types in the future without
changing it one more time.
```
public void processContract(String type) {
	if ("electricity".equals(type)) {
		System.out.println("Processed electricity");
	} else if ("dsl".equals(type)) {
		System.out.println("Processed dsl");
	} else if ("appartment_rent".equals(type)) {
		System.out.println("Processed appartment");
	}
	.
	.
	.
}
```

## Solution

Solution is simple store the type values in a Enum for lookup.

Ex: You need to do something like this.....

```
public void processContract(String type) {
		try{
			TypeConstant typeConstant = TypeConstant.valueOf(type);
			System.out.println("Processed "+typeConstant.getType());
		}catch(IllegalArgumentException e){
			System.out.println("Invalid Type selected: "+type);
		}
	}
```

Here **TypeConstant** is a enum constant something like this

```
public enum TypeConstant{
	electricity("electricity"),
	dsl("dsl"),
	appartment_rent("appartment rent");
		
	private String type;
		 
	TypeConstant(String type) {
	     this.type = type;
	}
		
	public String getType() {
	     return type;
	}
}
```

So in future if you have any diffrent types to add, you dont need to change the code inside the **process** method. You just need to add it in TypeConstant Enum.

### Prerequisites

For this application to run below are the pre requisite

1. Java (Used for development)
2. Maven (Used for building and running application, for the best effects kindly use IDE like STS or Eclipse).

### How to start app??

Below are the steps to do run the application....

##### Running the project

To start app from IDE 

**STS**
```
 Right click on project -> Run as -> Spring boot app
```
**Eclipse**
```
 Right click on GameLauncher.java -> Run as -> Java application
```

**CLI**
From project folder execute below command. Since this is a mavenised project we will use below command.
```
 mvn clean install
```
```
 mvn spring-boot:run
```


## Authors

**Shaik Fareed** : Full stack Java developer at GE
**Email id** : shaikfareed46@gmail.com


## Help

###### Please conatct me, if you have problems executing the app. 
