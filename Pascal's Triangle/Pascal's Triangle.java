public class Solution { 
    public List<List> generate(int numRows) {
        List<List> list = new ArrayList<List>();
        if( numRows== 0 ) return list;
        for ( int i = 0; i < numRows; i++ ){
            List<Integer> value = new ArrayList<Integer>();
            if ( i == 0 ){
                value.add(1);
                list.add(value);
                continue;
            } else {
                List<Integer> last = list.get(list.size()-1);
                for ( int k = 0; k <= i; k++ ){
                    if ( k == 0 ) value.add(1);
                    else if( k == i ) value.add(1);
                    else{
                        value.add(last.get(k-1)+last.get(k));
                    }
                } 
                list.add(value);
            }
        }
        return list;
    }
}
