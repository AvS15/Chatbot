package de.bot;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ChatbotTest {

    private ChatBot cb = new ChatBot();

   

    @Test
    public void howAreYou() {
        String reply = cb.getReply("How are you");
        assertThat(reply, is("I'm fine. Thank you."));
    }

    @Test void myNameIs() {
        String reply = cb.getReply("My name is Roger");
        assertThat(reply, is("Nice to meet you, Roger."));
    }

	@Test void coding() {
        String reply = cb.getReply("Do you like coding");
        assertThat(reply, is("Yes. I like Python and Rivescript."));
    }
	
	@Test void testAnswer() {
        String reply = cb.getReply("hfkfsdif");
        assertThat(reply, is("Sorry, but I don't understand."));
    }
}
