import axios from "axios";

export const getCareer = (skills) => {
  return axios.post("http://localhost:8080/api/career", {
    skills
  });
};
