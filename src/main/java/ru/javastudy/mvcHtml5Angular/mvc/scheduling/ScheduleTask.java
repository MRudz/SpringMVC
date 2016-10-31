package ru.javastudy.mvcHtml5Angular.mvc.scheduling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.javastudy.mvcHtml5Angular.mvc.email.EmailModel;
import ru.javastudy.mvcHtml5Angular.mvc.email.EmailService;

@Component
public class ScheduleTask {

    @Autowired
    EmailService emailService;

    private EmailModel emailModel = new EmailModel("r.max95@mail.ru");

  /*  @Scheduled(cron = "0/15 * * * * ?")
    public void cronSchedule() {
        Map<String, Object> model = new HashMap<>();
        model.put("subject", "Hello from Max!");
        model.put("to", emailModel.getEmail());
        model.put("ccList", new ArrayList<>());
        model.put("bccList", new ArrayList<>());
        model.put("userName", "javastudyUser");
        model.put("urljavastudy", "javastudy.ru");
        model.put("message", "asdasdasdvdgfbdqawd");
        boolean result = emailService.sendEmail("registered.vm", model);
        System.out.println("Is email send?" + result);
    }*/

   /* @Scheduled(cron = "2/20 * * * * ?")
    public void setEmail(){
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            emailModel.setEmail("mixp95@mail.ru");
        } else {
            emailModel.setEmail("r.max95@mail.ru");
        }
        System.out.println(i);
    }*/
}
