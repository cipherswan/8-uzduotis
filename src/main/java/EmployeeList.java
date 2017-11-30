public class EmployeeList implements Container{

    String name[] = {"Jonas Jonaitis", "Petras Petraitis", "Ona Onaitė"};


    @Override
    public Iterator getIterator() {
        return new EmployeeListIterate();
    }

    private class EmployeeListIterate implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i<name.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return name[i++];
            }
            return null;
        }
    }
}
