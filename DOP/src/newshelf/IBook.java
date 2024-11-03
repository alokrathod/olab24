package newshelf;

sealed public interface IBook permits Comic, Fiction, TextBook {}
