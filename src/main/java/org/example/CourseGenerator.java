package org.example;


import java.util.Arrays;
import java.util.List;


//We create this class for already given course names for make it more like Student Portal
public class CourseGenerator {

    private static final List<String> cengCourses = Arrays.asList("Introduction to Programming", "Data Structures",
            "Algorithms", "Computer Architecture", "Operating Systems", "Computer Networks", "Database Systems", "Software Engineering",
            "Artificial Intelligence", "Machine Learning", "Computer Graphics", "Computer Vision", "Natural Language Processing",
            "Human-Computer Interaction", "Distributed Systems", "Operations Research", "Computer Security", "Data Mining",
            "Web Development", "Mobile Application Development", "Computer Forensics", "Parallel Computing", "Computer Game Development",
            "Virtual Reality", "Computer Ethics",
            "Quantum Computing", "Neural Networks");
    private static final List<String> eeeCourses= Arrays.asList("Introduction to Circuit Analysis", "Electronics I",
            "Electronics II", "Digital Logic Design", "Computer Architecture", "Control Systems", "Electromagnetics",
            "Signals and Systems", "Power Systems", "Power Electronics", "Renewable Energy", "Electric Machines", "Electric Drives",
            "Analog and Digital Communications", "Microwave Engineering", "Antennas and Propagation", "Satellite Communications",
            "Telecommunications", "Digital Signal Processing", "Computer Networks", "Wireless Communications",
            "Optical Communications", "VLSI Design", "Microprocessors and Microcontrollers");
    private static final List<String> ieCourses = Arrays.asList("Probability and Statistics", "Introduction to Programming", "Engineering Economics",
            "Engineering Management", "Engineering Statistics", "Operations Research", "Industrial Safety",
            "Quality Control", "Manufacturing Systems", "Inventory Control", "Logistics and Supply",
            "Ergonomics", "Work Measurement", "Facilities Planning", "Human Factors Engineering", "Project Management",
            "Sustainability in IE", "Industrial Automation", "Industrial Robotics", "Industrial Data Analysis",
            "Industrial Internet of Things", "Industrial Maintenance", "Industrial System Design",
            "Industrial System Optimization", "Industrial System Simulation");
    private static final List<String> meCourses = Arrays.asList("Mechanics of Materials", "Dynamics", "Thermodynamics", "Fluid Mechanics",
            "Heat Transfer", "Manufacturing Processes", "Mechatronics", "Machine Design", "Automotive Engineering",
            "Aerospace Engineering", "Robotics", "Control Systems", "Numerical Methods", "Combustion", "Turbomachinery",
            "Refrigeration and Conditioning", "Energy Conversion", "Structural Analysis", "Finite Element Analysis",
            "Computational Fluid Dynamics", "Product Design and Development", "Engineering Materials", "Continuum Mechanics",
            "Nonlinear Dynamics", "Vibrations");
    private static final List<String> ceCourses = Arrays.asList("Structural Analysis", "Structural Design", "Construction Materials",
            "Construction Management", "Geotechnical Engineering", "Hydraulics and Hydrology",
            "Environmental Engineering", "Transportation Engineering", "Surveying", "Municipal Engineering",
            "Coastal Engineering", "Geographic Information Systems", "Remote Sensing", "Earthquake Engineering",
            "Tunneling and Underground", "Wind Engineering", "Solar Energy Engineering",
            "Sustainability in Engineering", "Structural Health Monitoring", "Infrastructure Planning",
            "Risk and Reliability Analysis", "Bridge Engineering", "Highway Engineering", "Airport Engineering");
    private static final List<String> eseCourses = Arrays.asList("Thermodynamics", "Fluid Mechanics", "Heat Transfer", "Renewable Energy Systems",
            "Energy Conversion", "Energy Storage", "Power Generation", "Power Transmission", "Combustion",
            "Turbomachinery", "Refrigeration and Conditioning", "Energy Economics", "Energy Policy and Regulation",
            "Energy Management", "Sustainable Energy", "Fuel Cells", "Nuclear Engineering",
            "Energy Systems Modeling", "Energy Systems Optimization", "Smart Grid", "Energy Systems Control",
            "Energy Systems Safety", "Energy Systems Integration", "Carbon Capture and Storage");

    public static List<String> getCengCourses() {
        return cengCourses;
    }

    public static List<String> getEeeCourses() {
        return eeeCourses;
    }
    public static List<String> getIeCourses() {
        return ieCourses;
    }
    public static List<String> getMeCourses() {
        return meCourses;
    }
    public static List<String> getCeCourses() {
        return ceCourses;
    }
    public static List<String> getEseCourses() {
        return eseCourses;
    }

}

