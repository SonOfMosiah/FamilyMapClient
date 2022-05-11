package com.wammon2.android.familymapclient_cs240;

public class DataCache {

        private static DataCache instance = new DataCache();

        public static DataCache getInstance() {
            return instance;
        }

        private DataCache() {
        }

        Map<PersonId, Person> people;
        Map<EventId, Event> events;
        Map<PersonId, List<Event>> personEvents;
        Set<PersonId> paternalAncestors;
        Set<PersonId> maternalAncestors;

        Settings settings;

        Person getPersonById(PersonId id ) {

        }

        Event getEventById(EventId id) {

        }

        List<Event> getPersonEvents(PersonId id) {

        }

}
