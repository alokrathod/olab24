package bonus;

public sealed interface IBook<T,V> extends Comparable<V> permits Comic,TextBook,Fiction{
	T printName();
}

