public class StoreDB {

public static Store getStoreByDivisionStore(String divisionNbr, String inStore) {
Store store = new Store();
if (divisionNbr.equals("001")) {
if (inStore.equals("00011")) {
store.setId(1);
store.setStoreNbr(inStore);
store.setDivisionNbr(divisionNbr);
store.setName("mason Bigbox");
store.setSales("$25,000");
store.setAddress("5711 Fields Ertel Rd.");
store.setCity("Mason");
store.setState("OH");
store.setZip("45249");

} else if (inStore.equals("00255")) {

store.setId(2);
store.setName("Downtown Bigbox");
store.setSales("$27,500");
store.setAddress("9330 Main St.");
store.setCity("Cincinnati");
store.setState("OH");
store.setZip("45202");

} else if (inStore.equals("00172")) {

store.setId(3);
store.setName("Goshen BigBox");
store.setSales("$32555.55");
store.setAddress("6777 Goshen Rd.");
store.setCity("Goshen");
store.setState("OH");
store.setZip("45122");

} else if (inStore.equals("00075")) {

store.setId(4);
store.setName("Bridgetown BigBox");
store.setSales("$21425.37");
store.setAddress("3888 Race Rd");
store.setCity("Cincinnati");
store.setState("OH");
store.setZip("45211");

}
} else if (divisionNbr.equals("111")) {
if (inStore.equals("00001")) {

store.setStoreNbr(inStore);
store.setDivisionNbr(divisionNbr);
store.setId(5);
store.setName("Louisville BigBox");
store.setSales("14432.77");
store.setAddress("1111 Washington St");
store.setCity("Louisville");
store.setState("KY");
store.setZip("40206");

} else if (inStore.equals("00044")) {

store.setId(6);
store.setName("Lawrenceburg BigBox");
store.setSales("$17555.11");
store.setAddress("8000 Liberty St.");
store.setCity("Louisville");
store.setState("KY");
store.setZip("40204");

}
}
return store;
}

}


