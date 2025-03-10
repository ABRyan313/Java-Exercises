import java.util.List;

public class SearchHandler {


        private List<String> list;

        public SearchHandler(List<String> names){
            this.list = names;
        }

        public boolean Search(String name){
            for(String s: list){
                if (s.equals(name)){
                    return true;
                }
            }
            return false;
        }
    }


