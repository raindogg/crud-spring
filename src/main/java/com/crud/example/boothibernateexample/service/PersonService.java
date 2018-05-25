public interface PersonService {
  Person createPerson (Person person);
  Person getPreson(Long id);
  Person editPerson(Person person);
  void deletePerson(Person person);
  void deletePerson(Long id);
  List<Person> getAllPersons(int pageNumber, int pageSize);
  List<Person> getAllPersons();
  long countPersons();
  List<Person> fuzzySearchPerson(String term);
  List<Person> wildCardSearchPerson(String term);
}