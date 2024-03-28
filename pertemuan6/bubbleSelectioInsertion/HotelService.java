package pertemuan6.bubbleSelectioInsertion;

public class HotelService {
    Hotel listHotel[] = new Hotel[5];
    int idx;

    void tambah(Hotel h){
        if (idx<listHotel.length) {
            listHotel[idx] = h;
            idx++;
        }else{
            System.out.println("Hotel sudah terpenuhi");
        }
    }
    void tampilAll(){
        for(Hotel h : listHotel){
            h.tampilAll();
            System.out.println("-----------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i<listHotel.length; i++){
            for(int j = 1; j<listHotel.length; j++){
                if (listHotel[j].bintang > listHotel[j-1].bintang) {
                    Hotel tmp = listHotel[j];
                    listHotel[j] = listHotel[j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i =0; i<listHotel.length-1; i++){
            idx = i;
            for(int j=i+1; j<listHotel.length; j++){
                if(listHotel[j].bintang < listHotel[idx].bintang){
                    idx = j;
                }
            }
            Hotel tmp = listHotel[idx];
            listHotel[idx] = listHotel[i];
            listHotel[i] = tmp;
        }
    }
}
