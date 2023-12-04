package main.java.customfunction;


import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

	String RESULTS_TITLE_SELECTOR = "a h3";
	
	public boolean isInResults(WebDriver driver, String expectedTitle, int nbOfResultsToSearch)
	{
	    return IntStream.range(0, Math.min(driver.findElements(By.cssSelector(RESULTS_TITLE_SELECTOR)).size(), nbOfResultsToSearch))
	            .anyMatch(index -> driver.findElements(By.cssSelector(RESULTS_TITLE_SELECTOR)).get(index).getText().contains(expectedTitle));
	}

}
