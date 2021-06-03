package com.postService.post.clients;

import com.postService.post.utils.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="http://1b8e42aa52c1.ngrok.io",name="USER-CLIENT")
public interface FeignClientProfile {

    @GetMapping("/user/{userId}")
    public ResponseEntity<Response> getProfile(@PathVariable String userId);

    @GetMapping("/name/{name}")
    public ResponseEntity<Response> getProfileFromName(@PathVariable String name);
}