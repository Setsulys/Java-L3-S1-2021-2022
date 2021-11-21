package fr.uge.blockbuster;

import java.util.Map;
import java.util.Objects;
import java.util.LinkedHashMap;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;


public class Catalog {
	
	private final Map<String,Article> library;
	
	
	public Catalog() {
		library = new LinkedHashMap<String,Article>();
	}
	
	public void add(Article movie) {
		Objects.requireNonNull(movie);
		var article = library.putIfAbsent(movie.name(),movie);
		 if( article != null) {
			 throw new IllegalArgumentException("Article already in the Catalog");
		 }
	}

	public Article lookup(String name) {
		Objects.requireNonNull(name);
		return library.getOrDefault(name,null);
	}
	
	public void toText(){
		this.toText();
	}
	
	public void save(Path path,Charset charset) {
		try(var writer = Files.newBufferedWriter(path,charset)){
			for(var element : library.entrySet()) {
				writer.write(element.getValue().toText());
				writer.newLine();
			}
		}catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);	
			return;
		}
	}
	
	public void load(Path path,Charset charset) {
		try(var reader = Files.newBufferedReader(path,charset)){
			String line;
			while((line = reader.readLine()) != null) {
				this.add(Article.fromText(line));
			}
		}catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);	
			return;
		}
	}
/*-Overloading-*/	
	public void save(Path path) {
		save(path,Charset.forName("UTF-8"));
	}
	
	public void load(Path path) {
		load(path,Charset.forName("UTF-8"));
	}
	
	
}
