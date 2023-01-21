package com.assignment4;
import java.io.*;
import java.util.*;

public class ProcessFiles {
	static String[] cols = null;
	static String title = "";
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Files course1 = new Files();
		Files course2 = new Files();
		Files course3 = new Files();
		ArrayList<Person> c1 = new ArrayList<Person>();
		ArrayList<Person> c2 = new ArrayList<Person>();
		ArrayList<Person> c3 = new ArrayList<Person>();
		
		File file = new File("file.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		}
		catch (Exception e) {
			
		}
		
		String line = "";
		String eachLine = "";
		int low = 0;
		
		try { 
			while((line = br.readLine()) != null ) {
				eachLine = line;
				cols = eachLine.split(",");
				
				if(low == 0 ) {
					title = eachLine;
				}
				else { 	
					Person currentPerson = new Person();
					Integer currentID = Integer.parseInt(cols[0]);
					Integer currentGrade = Integer.parseInt(cols[3]);
					currentPerson.setStudentID(currentID);
					currentPerson.setName(cols[1]);
					currentPerson.setCourseName(cols[2]);
					currentPerson.setGrade(currentGrade); 
					if(cols[2].contains("COMPSCI")) {
						c1.add(currentPerson); 
					}
					else if(cols[2].contains("STAT")) {
						c2.add(currentPerson);
					}
					else {
						c3.add(currentPerson);
					}
				}

				low++;
			}
		}
		catch (Exception e) { 
		}
		
		Collections.sort(c1, new Comparator<Person>() { 
			@Override
			public int compare(Person o1, Person o2) { 
				return o2.getGrade().compareTo(o1.getGrade());
			}
			
		});
		Collections.sort(c2, new Comparator<Person>() { 
			@Override
			public int compare(Person o1, Person o2) { 
				return o2.getGrade().compareTo(o1.getGrade());
			}
			
		});
		Collections.sort(c3, new Comparator<Person>() { 
			@Override
			public int compare(Person o1, Person o2) { 
				return o2.getGrade().compareTo(o1.getGrade());
			}
			
		});
		
		course1.writing(title, "course1.csv", c1);
		course2.writing(title, "course2.csv", c2);
		course3.writing(title, "course3.csv", c3);
	}

}
