
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    private int[] collection;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {   
        collection = new int [0]; // Se inicializa con 0 elementos para ahorrar espacio.
    }

    /**
     * Metodo añade un elemento a la colección al final de la misma.
     */
    public void add (int element)
    {

        //nueva lista creada
        int[] newList = new int[collection.length + 1];
        //Copiamos de la lista antigua a la nueva
        for (int index = 0; index < collection.length; index++ )
        {
            newList[index] = collection[index];
        }
        //Metemos el elemento nuevo en la lista nueva
        newList[collection.length] = element;

        //Guardamos la lista nueva
        collection = newList;

    }

    /**
     * Metodo añade un elemento a la colección en la posición especificada por el parámetro.
     */
    public void add (int index, int element)
    {
        int[] newList = new int[collection.length + 1]; 
        if(index < collection.length && index>= 0)
        {
            //Guardamos los elementos en las posiciones indicadas a las anteriores
            for (int i = 0;   i != index; i++ )
            {
                newList[i] = collection[i];
            }
            //Metemos el nuevo elemento en la posicion indicada
            newList[index] = element;
            //Metemos el elemento despues de la posicion indicada
            for (int i = index; i < collection.length;  i++ )
            {
                newList[i  + 1] = collection[i];
            }

            //Guardamos la lista nueva
            collection = newList;
        }

    }

    /**
     * Metodo que vacia la coleccion
     */
    public void clear()
    {
        collection = new int[0];
    }

    /**
     * Metodo que devuelve true si la colección contiene ese elemento.
     */
    public boolean contains(int  element)
    { boolean contains = false;
        //Recorremos en busca del elemento
        for (int index = 0; index < collection.length && !contains; index++ )
        {
            if (collection[index] ==  element)//Si la coleccion contiene ese elemento
            {
                contains = true;
            }
        }
        return contains;
    }

    /**
     * devuelve el elemento existente en la indice indicado.
     * -1 si la posicion no es correcta
     */
    public int get(int index)
    {
        int num; //variable numerica entera num
        if(index < collection.length && index>= 0)//Si el numero es menor que la coleccion
        {
            num = collection[index];//Metemos a num el numero de la collecion
        }
        else
        {
            num = -1;//sino restamos 1
        }	
        return num;
    }

    /**
     * Metodo que reemplaza el elemento en la posición index con el valor de element. 
     * Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element)
    {
        if(index < collection.length && index>= 0)
        {
            collection[index] = element;
        }
    }

    /**
     * Metodo que devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o
     * -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int element)
    {
        int index = -1;
        //Recorremos en busca del elemento si existe
        if(contains(element))
        {
            boolean contains = false;
            //Recorremos en busca del elemento
            for (int i = 0; i < collection.length && !contains; i++ )
            {
                if (collection[i]== element)
                {
                     //Cuando lo encuentre true y guardamos el indice
                    contains = true;
                    index = i;
                }
            }

        }
        return index;
    }

    /**
     * Metodo que devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        return collection.length==0;
    }

    /**
     * Metodo que devuelve el número de elementos de la colección.
     */
    public int size()
    {
        return collection.length;
    }

    /**
     * Metodo que  elimina de la colección el elemento que ocupa la posición especificada y
     * devuelve dicho elemento. 
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index)
    {
        int num = -1;
        int[] newList = new int[collection.length - 1]; 
        if(index < collection.length && index >= 0)
        {
            //Guardamos los elementos en las posiciones indicadas a las anteriores
            for (int i = 0;   i != index; i++ )
            {
                newList[i] = collection[i]; 
            }

            //guardamos el elemento que se borra pero no lo añadimos a la nueva lista
            
            num = collection[index];

             //Metemos el nuevo elemento despues de la posicion indicada
            for (int i = index+1; i < collection.length;  i++ )
            {
                newList[i-1] = collection[i];
            }

             //Guardamos la lista nueva
            collection = newList;

        }

        return num;
    }
}

