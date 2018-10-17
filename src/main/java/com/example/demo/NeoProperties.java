package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NeoProperties {
	@Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String description;
    @Value("${hello.world}")
    private String hellworld;
	public String getHellworld() {
		return hellworld;
	}
	public void setHellworld(String hellworld) {
		this.hellworld = hellworld;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
