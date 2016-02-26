
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
    public void addElemento (int elemento)
    {

        //nueva lista creada
        int[] newList = new int[collection.length + 1];
        //copiado de lista antigua en la nueva
        for (int index = 0; index < collection.length; index++ )
        {
            newList[index] = collection[index];
        }
        //agregado de nuevo elemento en la nueva lista
        newList[collection.length] = elemento;

        //guardado de la nueva lista
        collection = newList;

    }

    /**
     * Metodo añade un elemento a la colección en la posición especificada por el parámetro.
     */
    public void addElementoPosicion (int index, int elemento)
    {
        int[] newList = new int[collection.length + 1]; 
        if(index < collection.length && index>= 0)
        {
            //guardado de elementos en las posiciones anteriores a la indicada
            for (int i = 0;   i != index; i++ )
            {
                newList[i] = collection[i];
            }
            //insercion de nuevo elemento en la posicion indicada
            newList[index] = elemento;
            //agregado de elementos despues de la posicion indicada
            for (int i = index; i < collection.length;  i++ )
            {
                newList[i  + 1] = collection[i];
            }

            //guardado de la nueva lista
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
    public boolean contains(int  elemento)
    { boolean contains = false;
        //recorrido en busca del elemento
        for (int index = 0; index < collection.length && !contains; index++ )
        {
            if (collection[index]==  elemento)
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
        int num; //variable numerica
        if(index < collection.length && index>= 0)//Si el numero es menor que la coleccion
        {
            num = collection[index];//num tiene el numero de la collecion
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
    public void set(int index, int elemento)
    {
        if(index < collection.length && index>= 0)
        {
            collection[index] = elemento;
        }
    }

    /**
     * Metodo que devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o
     * -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento)
    {
        int index = 0;
        //recorrido en busca del elemento en caso de que exita
        if(contains(elemento))
        {
            boolean contains = false;
            //recorrido en busca del elemento
            for (int i = 0; i < collection.length && !contains; i++ )
            {
                if (collection[i]== elemento)
                {
                    //marcado como encontrado y guardado del indice
                    contains = true;
                    index = i;
                }
            }

        }
        //en caso de que no exista el elemento
        else
        {
            index = -1;
        }

        return index;
    }

    /**
     * Metodo que devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        //inicializamos como si tuvieramos elementos
        boolean isEmpty = false;
        //si esta vacio
        if(collection.length == 0)
        {
            isEmpty = true;
        }
        return isEmpty;
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
        //indice valido
        if(index < collection.length && index >= 0)
        {
            //guardado de elementos en las posiciones anteriores a la indicada
            for (int i = 0;   i != index; i++ )
            {
                newList[i] = collection[i]; 
            }

            //guardado para el retorno del elemento que se borra
            //no es guardado en la nueva lista
            num = collection[index];

            //agregado de elementos despues de la posicion indicada
            for (int i = index+1; i < collection.length;  i++ )
            {
                newList[i-1] = collection[i];
            }

            //guardado de la nueva lista
            collection = newList;

        }

        return num;
    }
}

