package test.spring;

import org.springframework.stereotype.Service;

@Service
public class RandomEmailGenerator implements EmailGenerator {

	@Override
	public String generate() {
		return "feedback@yoursite.com";
	}

}