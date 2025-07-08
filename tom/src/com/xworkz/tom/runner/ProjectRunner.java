package com.xworkz.tom.runner;

import com.xworkz.tom.dto.ProjectDto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProjectRunner {
    public static void main(String[] args) {

        ProjectDto projectDto1 = new ProjectDto(201, "Google");
        ProjectDto projectDto2 = new ProjectDto(202, "YouTube");
        ProjectDto projectDto3 = new ProjectDto(203, "Gmail");
        ProjectDto projectDto4 = new ProjectDto(204, "Google Maps");
        ProjectDto projectDto5 = new ProjectDto(205, "Google Drive");
        ProjectDto projectDto6 = new ProjectDto(206, "Google Docs");
        ProjectDto projectDto7 = new ProjectDto(207, "Android");
        ProjectDto projectDto8 = new ProjectDto(208, "Chrome");
        ProjectDto projectDto9 = new ProjectDto(209, "Google Ads");
        ProjectDto projectDto10 = new ProjectDto(210, "Google Cloud");
        ProjectDto projectDto11 = new ProjectDto(211, "Pixel");
        ProjectDto projectDto12 = new ProjectDto(212, "Nest");
        ProjectDto projectDto13 = new ProjectDto(213, "Firebase");
        ProjectDto projectDto14 = new ProjectDto(214, "TensorFlow");
        ProjectDto projectDto15 = new ProjectDto(215, "Bard");
        ProjectDto projectDto16 = new ProjectDto(216, "Google Translate");
        ProjectDto projectDto17 = new ProjectDto(217, "Waze");
        ProjectDto projectDto18 = new ProjectDto(218, "Google Earth");
        ProjectDto projectDto19 = new ProjectDto(219, "Google News");
        ProjectDto projectDto20 = new ProjectDto(220, "Google Calendar");
        ProjectDto projectDto21 = new ProjectDto(221, "Google Play");
        ProjectDto projectDto22 = new ProjectDto(222, "Google Photos");
        ProjectDto projectDto23 = new ProjectDto(223, "Google Sheets");
        ProjectDto projectDto24 = new ProjectDto(224, "Google Meet");
        ProjectDto projectDto25 = new ProjectDto(225, "Google Keep");

        Map<ProjectDto,String[]> map=new HashMap<>();

        map.put(projectDto1, new String[]{"Java", "Spring", "MySQL"});
        map.put(projectDto2, new String[]{"Node.js", "React", "MongoDB"});
        map.put(projectDto3, new String[]{"Java", "Spring Boot", "Kafka"});
        map.put(projectDto4, new String[]{"C++", "Python", "OpenGL"});
        map.put(projectDto5, new String[]{"Java", "GCP", "Bigtable"});
        map.put(projectDto6, new String[]{"JavaScript", "TypeScript", "Firebase"});
        map.put(projectDto7, new String[]{"Kotlin", "Java", "Jetpack"});
        map.put(projectDto8, new String[]{"C++", "JavaScript", "Blink"});
        map.put(projectDto9, new String[]{"Python", "BigQuery", "Dataflow"});
        map.put(projectDto10, new String[]{"Go", "Kubernetes", "GKE"});
        map.put(projectDto11, new String[]{"C", "C++", "Android"});
        map.put(projectDto12, new String[]{"Python", "IoT", "Machine Learning"});
        map.put(projectDto13, new String[]{"Node.js", "Express", "Firestore"});
        map.put(projectDto14, new String[]{"Python", "C++", "ML"});
        map.put(projectDto15, new String[]{"Python", "Transformers", "JAX"});
        map.put(projectDto16, new String[]{"TensorFlow", "NLP", "Flask"});
        map.put(projectDto17, new String[]{"Swift", "Kotlin", "Maps API"});
        map.put(projectDto18, new String[]{"C++", "OpenGL", "3D Rendering"});
        map.put(projectDto19, new String[]{"Java", "Elasticsearch", "Kafka"});
        map.put(projectDto20, new String[]{"Java", "Spring", "REST API"});
        map.put(projectDto21, new String[]{"Java", "Kotlin", "Billing API"});
        map.put(projectDto22, new String[]{"Python", "TensorFlow", "GCP"});
        map.put(projectDto23, new String[]{"JavaScript", "Apps Script", "Sheets API"});
        map.put(projectDto24, new String[]{"WebRTC", "Java", "GCP"});
        map.put(projectDto25, new String[]{"Flutter", "Firebase", "Cloud Firestore"});

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);
        System.out.println("Values");
        map.values().forEach(e-> System.out.println(Arrays.toString(e)));
    }
}
